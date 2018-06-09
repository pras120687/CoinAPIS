package resources;

public class PayLoad {

	public static String reviewAndSave() {

		String s = "{" + "\"reviewFromUid\":\"34\"," + "\"reviewtoUid\":\"7\"," + "\"rating\":\"5\","
				+ "\"reviewMsg\":\"Nice work\"," + "\"projectId\":\"97\"," + "\"profileId\":\"1\","
				+ "\"reviewFromuname\":\"pras120687\"," + "\"reviewtouname\":\"vinay\"," +

				"}";

		return s;

	}

	public static String sendProjectProgress() {
		String s1 = "{" + "\"projectId\":\"97\"," + "\"progressValue\":\"30\"," + "}";

		return s1;
	}

	public static String fundsTransfer() {
		String s = "{" +

				"\"fromAddress\":\"0xd770A63c59B9915AEb0cA673b001C6A5fd96b6BC\","
				+ "\"toAddress\":\"0x66DA834C437D5433e1aA233859C513aeA01292e3\"," + "\"requestAmount\":\"500\"," +

				"}";

		return s;
	}

	public static String addFAQ() {
		String s = "{" +

				"\"question\":\"What is Freelancer?\","
				+ "\"answer\":\"It is a dev site\"," +

				"}";

		return s;
	}

}
