package com.cxy.mall.exception;

public class APIException extends RuntimeException
{

	private static final long	serialVersionUID	= -1641460548560292808L;
	
	protected int code = 5000;
	
	public APIException()
	{
		this( null, null );
	}
	
	public APIException( String msg )
	{
		this( msg, null );
	}
	
	public APIException( Throwable e )
	{
		this( e.getMessage(), e );
	}
	
	public APIException( String msg, Throwable e )
	{
		super( msg, e );
	}
	
	public int getCode()
	{
		return code;
	}

}
