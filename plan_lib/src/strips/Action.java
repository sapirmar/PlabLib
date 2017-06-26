package strips;

public class Action extends Predicate{

	Clause preconditions;
	Clause effects;

	public Clause getPreconditions() {
		return preconditions;
	}

	public void setPreconditions(Clause preconditions) {
		this.preconditions = preconditions;
	}

	public Clause getEffects() {
		return effects;
	}

	public void setEffects(Clause effects) {
		this.effects = effects;
	}

	public Action(String type, String id, String value) {
		super(type, id, value);
		// TODO Auto-generated constructor stub
	}



}
