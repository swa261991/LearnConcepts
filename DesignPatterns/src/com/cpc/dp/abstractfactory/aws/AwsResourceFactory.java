package com.cpc.dp.abstractfactory.aws;

import com.cpc.dp.abstractfactory.Instance;
import com.cpc.dp.abstractfactory.Instance.Capacity;
import com.cpc.dp.abstractfactory.ResourceFactory;
import com.cpc.dp.abstractfactory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
