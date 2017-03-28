package hjkj.bean;

import org.junit.Test;

/**
 * Created by YUB on 17/3/27.
 */
public class HeaderTest {

    private Header header;
    @Test
    public void testSetJHeader() {
        byte b = (byte)0xff;
        System.out.println(b);

    }
    @Test
    public void testGetType(){
        header = new Header();
        byte b = header.getType("T", "X");
        System.out.println(b);
    }
}
