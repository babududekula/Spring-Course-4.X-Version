package com.pack.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.util.FileCopyUtils;

import com.pack.dto.BlobClob;

public class BlobClobDaoImpl implements BlobClobDao 
{
	
	private JdbcTemplate jdbcTemplate;
	private LobHandler lobHandler;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setLobHandler(LobHandler lobHandler) 
	{
		this.lobHandler = lobHandler;
	}
	public LobHandler getLobHandler() 
	{
		return lobHandler;
	}

	@Override
	public void insertBlobClob(BlobClob bc) 
	{
		String query = "insert into BlobClob values(?,?,?,?)";
		jdbcTemplate.execute(query, new AbstractLobCreatingPreparedStatementCallback(lobHandler) 
		{
			
			@Override
			protected void setValues(PreparedStatement pst, LobCreator lobCreator) throws SQLException, DataAccessException 
			{
				try 
				{
					pst.setInt(1, bc.getId());
					pst.setString(2, bc.getName());
					FileInputStream fis = new FileInputStream(bc.getImage());
					FileReader fr = new FileReader(bc.getResume());
					
					lobCreator.setBlobAsBinaryStream(pst, 3, fis,(int) bc.getImage().length());
					lobCreator.setClobAsCharacterStream(pst, 4, fr, (int)bc.getResume().length());
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
			}
		});
	}

	@Override
	public BlobClob readBlobClob(int id) 
	{
		BlobClob bc = new BlobClob();
		String query = "select * from BlobClob where id="+id;
		jdbcTemplate.query(query, new AbstractLobStreamingResultSetExtractor<BlobClob>() 
		{

			@Override
			protected void streamData(ResultSet rs) throws SQLException, IOException, DataAccessException 
			{
				bc.setId(rs.getInt("id"));
				bc.setName(rs.getString("name"));
				
				File file = new File("G:/CopiedPhotoBlobClob.jpg");
				FileOutputStream fos = new FileOutputStream(file);
				FileCopyUtils.copy(lobHandler.getBlobAsBinaryStream(rs, 3), fos);
				bc.setImage(file);
				
				File file1 = new File("G:/CopiedResumeBlobClob.pdf");
				FileWriter fw = new FileWriter(file1);
				FileCopyUtils.copy(lobHandler.getClobAsCharacterStream(rs, 4), fw);
				bc.setResume(file1);		
				
			}
		});
		return bc;
	}

}


