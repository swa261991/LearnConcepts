package com.gsj.designpatterns.abstractfactory.aws;

import com.gsj.designpatterns.abstractfactory.Instance;
import com.gsj.designpatterns.abstractfactory.ResourceFactory;
import com.gsj.designpatterns.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
