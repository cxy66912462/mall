package com.cxy.mall.exception;

public class PermissionDeniedException extends APIException
{

	private static final long	serialVersionUID	= -7230914797115037016L;
	
	
	public PermissionDeniedException()
	{
		this( "Permission Denied" );
	}
	
	public PermissionDeniedException( String msg )
	{
		super( msg );
		code = 2000;
	}

}
