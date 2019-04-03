package society.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import society.bean.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	public List<User> selectAllUsers();
	
	@Select("select * from user where id = #{param1}")
	public User selectUserById(Integer id);
	
	@Update("update user set username = #{username},age = #{age},ctm = #{ctm},avator = #{avator},summary = #{summary}, voiceSummary = #{voiceSummary} where id = #{id}")
	public int updateUserById(User u );
	/**
	 * private Integer id;
	private String username;
	private Integer age;
	private Date ctm;
	private String avator ;
	private String summary = "这个人很懒,什么都没有留下...";
	private String voiceSummary;
	 * 
	 * */
	@Insert("insert into user(username,age,ctm,avator,summary,voiceSummary) values(#{username},#{age},#{ctm},#{avator},#{summary},#{voiceSummary})")
	public int insertUser(User user);
	
	@Delete("delete from user where id = #{param1}")
	public int deleteUser(Integer id);
}
 