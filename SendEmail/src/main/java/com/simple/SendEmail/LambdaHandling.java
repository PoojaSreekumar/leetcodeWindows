package com.simple.SendEmail;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandling implements RequestHandler<Object, Object>{

	@Override
	public Object handleRequest(Object input, Context context) {
		// TODO Auto-generated method stub
		new Appli().SendEmailFromTo();
		return "sending email";

}
}