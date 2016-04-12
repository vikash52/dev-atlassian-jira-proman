package org.raboss.dev.atlassian.jira.proman.entity;

import net.java.ao.*;
import net.java.ao.schema.Table;

/**
 * Created by bossekr on 08.03.16.
 * p.407
 */
@Preload
@Table("EvalCriterion")
public interface EvalCriterion extends Entity {
    public String getName();
    public void setName(String name);

    public int getWeighting();
    public void setWeighting(int weighting);

    public String getComment();
    public void setComment(String comment);

    public void setIsSmallNumberIsBetter(boolean v);
    public boolean isSmallNumberBetter();
    public void setIsBigNumberIsBetter(boolean v);
    public boolean isBigNumberBetter();

    public enum TypeOfIndex {
        INCOMPLETE,
        PLANNING_POKER,
        CHRONOLOGICAL_ORDER,
        PERCENTAGE,
        REFERENCE_QUANTITY,
    }

    public void setTypeOfIndex(TypeOfIndex typeOfIndex);
    public TypeOfIndex getTypeOfIndex();

    public void setReferenceQuantityDescription(String referenceQuantityDescription);
    public String getReferenceQuantityDescription();
}