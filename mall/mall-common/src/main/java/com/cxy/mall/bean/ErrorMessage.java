package com.cxy.mall.bean;

public class ErrorMessage
{
	public static final int 			CODE_SUCCESS = 1000;
	public static final String 		MSG_SUCCESS = "SUCCESS";
	
	public static final int 			CODE_SYS_EXCEPTION = 5998;
	public static final String		MSG_SYS_EXCEPTION = "SYS_EXCEPTION";
	
	public static final int 			CODE_UNKNOWN_ERROR = 5999;
	public static final String 		MSG_UNKOWN_ERROR = "UNKNOWN_ERROR";
	
	private int			code	= 0;

	private String			msg		= "";

	private boolean		authenticated	= true;

	private Object			data	= null;

	public ErrorMessage()
	{
		
	}
	
	public ErrorMessage( int code, String messageinfo )
	{
		this.code = code;
		this.msg = messageinfo;
	}


	public ErrorMessage( int code, String messageinfo, boolean auth )
	{
		super();
		this.code = code;
		this.msg = messageinfo;
		this.authenticated = auth;
	}


	public int getCode()
	{
		return code;
	}


	public void setCode( int code )
	{
		this.code = code;
	}


	public Object getData()
	{
		return data;
	}


	public void setData( Object data )
	{
		this.data = data;
	}


	public String getMsg()
	{
		return msg;
	}


	public void setMsg( String msg )
	{
		this.msg = msg;
	}

	public boolean isAuthenticated()
	{
		return authenticated;
	}

	public void setAuthenticated( boolean authenticated )
	{
		this.authenticated = authenticated;
	}

}
