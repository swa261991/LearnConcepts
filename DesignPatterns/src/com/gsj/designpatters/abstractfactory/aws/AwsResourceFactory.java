package com.gsj.designpatters.abstractfactory.aws;

import com.gsj.designpatters.abstractfactory.Instance;
import com.gsj.designpatters.abstractfactory.ResourceFactory;
import com.gsj.designpatters.abstractfactory.Storage;

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
