package society.bean;

import lombok.Data;

@Data
public class Notify {
	private Integer id;
	private Integer senderid;
	private Integer reciverid;
	private String type;
	private Integer isRead;
	private String createTime;
}
