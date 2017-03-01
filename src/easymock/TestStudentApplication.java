package easymock;
import org.easymock.EasyMock;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestStudentApplication {
	IStudent student;
	StudentApplication application;
	@Test
	public void testdoMethod(){
		//•使用 EasyMock 生成 Mock 对象；
		student = EasyMock.createMock(IStudent.class);
		//设定 Mock 对象的预期行为和输出
		//StockMarket marketMock = EasyMock.createMock(StockMarket.class);
//		EasyMock.expect(marketMock.getPrice("EBAY")).andReturn(42.00);
//		EasyMock.replay(marketMock);
		EasyMock.expect(student.domethod1()).andReturn("a").times(1);
		EasyMock.expect(student.domethod2()).andReturn("b").times(1);
		EasyMock.expect(student.domethod3()).andReturn("c").times(1);
		//将 Mock 对象切换到 Replay 状态
		EasyMock.replay(student);
		//调用 Mock 对象方法进行测试
		application=new StudentApplication();
		application.setWms(student);
		String getStr=application.domethod();
		//对 Mock 对象的行为进行验证
		String cstr="abc";//正确的字符串
		Assert.assertEquals(getStr, cstr);
		EasyMock.verify(student);
	}
	
}
