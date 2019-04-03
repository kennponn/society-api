package society.bean;

import lombok.Data;

@Data
public class Message {
	private Integer id;
	private Integer senderid;
	private Integer reciverid;
	private Integer notifyid;
	private String content;
	private String createTime;
}
