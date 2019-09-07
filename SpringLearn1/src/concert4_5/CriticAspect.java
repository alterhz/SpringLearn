package concert4_5;

public aspect CriticAspect {
	public CriticAspect() {}
	
	pointcut performance() : execution(* concert4_5.Performance.perform(..));
	
	before() : performance() {
		System.out.println(criticismEngine.getCriticism());
	}
	
	private CriticismEngine criticismEngine;
	
	public void setCriticismEngine(CriticismEngine criticismEngine) {
		this.criticismEngine = criticismEngine;
	}
}
