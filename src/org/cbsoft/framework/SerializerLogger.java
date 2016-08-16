package org.cbsoft.framework;

public class SerializerLogger implements Serializer {
	
	private Serializer serializer;

	public SerializerLogger(Serializer serializer) {
		this.serializer = serializer;
	}

	@Override
	public void generateFile(String filename, Object obj) {
		System.out.println("Serializing file " + filename + ".....");
		serializer.generateFile(filename, obj);
	}

	public void setPostProcessor(PostProcessor pp) {
	}

	public PostProcessor getPostProcessor() {
		return null;
	}

}
