package kr.co.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ReplyVO {
	private int replyNm  ;
	private int boNm     ;
	private String cateCd   ;
	private String empId    ;
	private String replyCon ;
	private Date replyDate;
	
	private int replyCnt;
	
	
	//직원 테이블 join
	private String empName ;
	private String empProfile;
	private String empJob;
	
	
}
