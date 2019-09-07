package concert4_4_4_1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

	@DeclareParents(value="concert.Performance+",
			defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;

}
