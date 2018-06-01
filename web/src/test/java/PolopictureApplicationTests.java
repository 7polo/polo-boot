import com.polo.Application;
import com.polo.core.dao.PoloFileDao;
import com.polo.core.entity.PoloFile;
import com.polo.web.pic.PictureService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 18:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class PolopictureApplicationTests {

    @Autowired
    private PictureService pictureService;

    @Autowired
    private PoloFileDao poloFileDao;

    @Test
    public void contextLoads() {
       /* PoloFile file = new PoloFile();
        file.setFileName("沙河");
        poloFileDao.insert(file);
        int count = poloFileDao.count();
        System.out.println(count);*/
        PoloFile file = new PoloFile();
        file.setFileName("121");
        poloFileDao.insert(file);

    }

}
