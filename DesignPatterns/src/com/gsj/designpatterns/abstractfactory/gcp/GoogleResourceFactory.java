package com.gsj.designpatterns.abstractfactory.gcp;

import com.gsj.designpatterns.abstractfactory.Instance;
import com.gsj.designpatterns.abstractfactory.ResourceFactory;
import com.gsj.designpatterns.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
