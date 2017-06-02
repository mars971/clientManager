package managerartifactid;

import entity.Client;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		client.setFirstname("maxence");
		client.setName("TISSOT");
		
		System.out.println("toto"+client.getFirstname());
	}

}
