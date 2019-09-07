package concert;

public class CriticismengineImpl implements CriticismEngine {

	@Override
	public String getCriticism() {
		int i = (int)(Math.random() * criticismPool.length);
		return criticismPool[i];
	}

	private String[] criticismPool;
	public void setCriticismPool(String[] criticismPool) {
		this.criticismPool = criticismPool;
	}
}
