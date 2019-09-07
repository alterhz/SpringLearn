package soundsystem01;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//使用@Import导入
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig2 {

}
