package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor; 
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgramBatchPojo {
	
	public ProgramBatchPojo(String batchDescription2, String batchName2, int batchNoOfClasses2, String batchStatus2,
			int programId2) {
		// TODO Auto-generated constructor stub
	}
	@JsonProperty("batchDescription")
    private String batchDescription;
    @JsonProperty("batchName")
    private String batchName;
    @JsonProperty("batchNoOfClasses")
    private int batchNoOfClasses;
    @JsonProperty("batchStatus")
    private String batchStatus;
    @JsonProperty("programId")
    private int programId;
    
    
}





    
   


