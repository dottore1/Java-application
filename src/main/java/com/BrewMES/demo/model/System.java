package com.BrewMES.demo.model;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.api.config.OpcUaClientConfigBuilder;
import org.eclipse.milo.opcua.stack.client.DiscoveryClient;
import org.eclipse.milo.opcua.stack.core.types.structured.EndpointDescription;
import java.util.ArrayList;
import java.util.List;

public class System implements iSystem {
	private List<Machine> machines;
	private Machine currentMachine;
	private Batch selectedBatch;
	private List<Batch> latestBatches;

	public static void main(String[] args) {
		throw new UnsupportedOperationException();
	}

	public void setCurrentMachine(int machine) {
		throw new UnsupportedOperationException();
	}

	public Batch getBatch(int id) {
		throw new UnsupportedOperationException();
	}

	public void getReport(Batch batch) {
		throw new UnsupportedOperationException();
	}

	public void connectMachine(String ipAddress) {
		try {
			//get all endpoints from the machine
			List<EndpointDescription> endpoints = DiscoveryClient.getEndpoints(ipAddress).get();

			//loading endpoints into configuration
			OpcUaClientConfigBuilder cfg = new OpcUaClientConfigBuilder();
			cfg.setEndpoint(endpoints.get(0));

			//setting up machine client with config
			OpcUaClient connection = OpcUaClient.create(cfg.build());

			//connecting machine
			connection.connect().get();
			Machine newMachine = new Machine(ipAddress,connection);
			machines.add(newMachine);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnectMachine(int id) {
		throw new UnsupportedOperationException();
	}

	public void setMachineVariables(int speed, BeerType beerType, int batchSize) {
		throw new UnsupportedOperationException();
	}

	public void controlMachine(Command command) {
		throw new UnsupportedOperationException();
	}

	public String getMachineVariables() {
		throw new UnsupportedOperationException();
	}

}
