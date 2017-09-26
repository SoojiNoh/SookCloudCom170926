import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;


public class StringUtilsTests {

	@Test //@은 Annotation ; Eclipse>>환경설정>>General>>Key>>content assist>> key binding:: alt+space 정정함.	
	public void testIsBlank(){
//		String a = null;
		
		Assert.assertTrue(StringUtils.isBlank(null)); // 'Assert' >> content assist(alt+space)
		
//		if (StringUtils.isBlank(a)){//StringUtils에서 f3
//			System.out.println("a is blank");//'sysout'>> content assist(alt+space)
//		}
	}
	
//	@Test
//	public void testIsBlank2() throws Exception{
//		String a = null;
//		if (StringUtils.isBlank(a)){//StringUtils에서 f3
//			throw new Exception();
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
