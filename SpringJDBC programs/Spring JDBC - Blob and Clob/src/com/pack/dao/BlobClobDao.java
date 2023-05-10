package com.pack.dao;

import com.pack.dto.BlobClob;

public interface BlobClobDao 
{
	public void insertBlobClob(BlobClob bc);
	public BlobClob readBlobClob(int id);
}
