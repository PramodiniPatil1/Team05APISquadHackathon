package commons;

public class Commons {

	private static int programId  ;
	private static String programName;
	private static float batchId;
	private static String batchName;
	private static String userId;
	private static float batchId2;
	private static String batchName2;
		
	public static int getProgramId() {
		return programId;
	}
	public static void setProgramId(int programId) {
		Commons.programId = programId;
	}  
	public static String getProgramName() {
		return programName;
	}
	public static void setProgramName(String programName) {
		Commons.programName = programName;
	}
	
	public static float getbatchId() {
		return batchId;
	}
	public static void setbatchId(float batchId) {
		Commons.batchId = batchId;
	}
	
	public static String getbatchName() {
		return batchName;
	}
	public static void setbatchName(String batchName) {
		Commons.batchName = batchName;
	}
    
	public static String getuserId() {
		return userId;
	}
	public static void setuserId(String userId) {
		Commons.userId = userId;
	}
	
    private static String emailId;
    public static String getEmailId() {
        return emailId;
    }
    public static void setEmailId(String userLoginEmail) {
        Commons.emailId = userLoginEmail;   // :heavy_check_mark: correct assignment
    }
    private static String emailId1;
    public static String getUserEmailId() {
    	return emailId1;
    }
	public static void setUserEmailId(String getUserEmailId) {
		
		 Commons.emailId1 = getUserEmailId;
		 
	}
	public static float getbatchId1() {
		return batchId;
	}
	public static void setbatchId1(float batchId1) {
		Commons.batchId = batchId1;
	}
	
	public static String getbatchName1() {
		return batchName;
	}
	public static void setbatchName1(String batchName1) {
		Commons.batchName = batchName1;
	}

}
