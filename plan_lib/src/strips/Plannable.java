package strips;

import java.util.Set;
/**
 * for using strips need to implements plannable 
 * @author Sapir Markel and Roee Sisso
 *
 */
public interface Plannable {

	Clause getGoal();
	Clause getKnowledgebase();
	Set<Action> getsatisfyingActions(Predicate top);
	Action getsatisfyingAction(Predicate top);

}
