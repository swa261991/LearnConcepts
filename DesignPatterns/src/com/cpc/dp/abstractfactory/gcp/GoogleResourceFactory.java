package com.cpc.dp.abstractfactory.gcp;

import com.cpc.dp.abstractfactory.Instance;
import com.cpc.dp.abstractfactory.Instance.Capacity;
import com.cpc.dp.abstractfactory.ResourceFactory;
import com.cpc.dp.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
