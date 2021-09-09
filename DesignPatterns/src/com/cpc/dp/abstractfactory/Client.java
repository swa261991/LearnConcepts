package com.cpc.dp.abstractfactory;

import com.cpc.dp.abstractfactory.Instance.Capacity;
import com.cpc.dp.abstractfactory.aws.AwsResourceFactory;
import com.cpc.dp.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Client gcp = new Client(new GoogleResourceFactory());
    	i1 = gcp.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    }

    
}

/*
OUTPUT
------
Created Ec2Instance
Allocated 20480 on S3
Attached S3 Storage to Ec2Instance
Ec2Instance started
Ec2Instance stopped
***************************************
Created Google Compute Engine instance
Allocated 20480 on Google Cloud Storage
Attached Google cloud storage to Compute engine instance
Compute engine instance started
Compute engine instance stopped


* */
