package puzzle.treetent.rules;

import model.rules.ContradictionRule;
import model.tree.TreeTransition;

public class TooFewTentsContradictionRule extends ContradictionRule
{

    public TooFewTentsContradictionRule()
    {
        super("Too Few Tents", "Rows and columns cannot have fewer tents than their clue.", "images/treetent/too_few_tents.png");
    }

    /**
     * Checks whether the transition has a contradiction at the specific element index using this rule
     *
     * @param transition   transition to check contradiction
     * @param elementIndex index of the element
     *
     * @return null if the transition contains a contradiction at the specified element,
     * otherwise error message
     */
    @Override
    public String checkContradictionAt(TreeTransition transition, int elementIndex)
    {
        return null;
    }

    /**
     * Checks whether the child node logically follows from the parent node using this rule
     * and if so will perform the default application of the rule
     *
     * @param transition transition to apply default application
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplication(TreeTransition transition)
    {
        return false;
    }

    /**
     * Checks whether the child node logically follows from the parent node at the
     * specific element index using this rule and if so will perform the default application of the rule
     *
     * @param transition   transition to apply default application
     * @param elementIndex
     *
     * @return true if the child node logically follow from the parent node and accepts the changes
     * to the board, otherwise false
     */
    @Override
    public boolean doDefaultApplicationAt(TreeTransition transition, int elementIndex)
    {
        return false;
    }
}
