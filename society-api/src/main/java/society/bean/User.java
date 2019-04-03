package society.bean;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private Integer id;
	private String username;
	private Integer age;
	private Date ctm;
	private String avator ;
	private String summary = "这个人很懒,什么都没有留下...";
	private String voiceSummary;
	
}