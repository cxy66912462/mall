package com.cxy.mall.exception;

public class MissingFieldException extends APIException
{
	
	private static final long	serialVersionUID	= 2365993556597937972L;
	
	
	public MissingFieldException()
	{
		this( "Missing Field" );
	}
	
	public MissingFieldException( String msg  )
	{
		super( msg );
		code = 3000;
	}

}
