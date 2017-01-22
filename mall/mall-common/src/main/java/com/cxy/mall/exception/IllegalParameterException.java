package com.cxy.mall.exception;

public class IllegalParameterException extends APIException
{

	private static final long	serialVersionUID	= -2950839216140765027L;
	
	
	public IllegalParameterException()
	{
		this( "Illegal Field" );
	}

	public IllegalParameterException( String msg  )
	{
		super( msg );
		code = 4000;
	}
}
