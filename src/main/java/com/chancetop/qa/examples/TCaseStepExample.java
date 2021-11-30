package com.chancetop.qa.examples;

import java.util.ArrayList;
import java.util.List;

public class TCaseStepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCaseStepExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public TCaseStepExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TCaseStepExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        TCaseStepExample example = new TCaseStepExample();
        return example.createCriteria();
    }

    public TCaseStepExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TCaseStepExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTProjectIdIsNull() {
            addCriterion("t_project_id is null");
            return (Criteria) this;
        }

        public Criteria andTProjectIdIsNotNull() {
            addCriterion("t_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andTProjectIdEqualTo(Long value) {
            addCriterion("t_project_id =", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdNotEqualTo(Long value) {
            addCriterion("t_project_id <>", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThan(Long value) {
            addCriterion("t_project_id >", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_project_id >=", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThan(Long value) {
            addCriterion("t_project_id <", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("t_project_id <=", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdIn(List<Long> values) {
            addCriterion("t_project_id in", values, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdNotIn(List<Long> values) {
            addCriterion("t_project_id not in", values, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdBetween(Long value1, Long value2) {
            addCriterion("t_project_id between", value1, value2, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("t_project_id not between", value1, value2, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdIsNull() {
            addCriterion("t_case_id is null");
            return (Criteria) this;
        }

        public Criteria andTCaseIdIsNotNull() {
            addCriterion("t_case_id is not null");
            return (Criteria) this;
        }

        public Criteria andTCaseIdEqualTo(Long value) {
            addCriterion("t_case_id =", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotEqualTo(Long value) {
            addCriterion("t_case_id <>", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThan(Long value) {
            addCriterion("t_case_id >", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_case_id >=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThan(Long value) {
            addCriterion("t_case_id <", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdLessThanOrEqualTo(Long value) {
            addCriterion("t_case_id <=", value, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdIn(List<Long> values) {
            addCriterion("t_case_id in", values, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotIn(List<Long> values) {
            addCriterion("t_case_id not in", values, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdBetween(Long value1, Long value2) {
            addCriterion("t_case_id between", value1, value2, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andTCaseIdNotBetween(Long value1, Long value2) {
            addCriterion("t_case_id not between", value1, value2, "tCaseId");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("`action` is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("`action` is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("`action` =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("`action` <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("`action` >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("`action` >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("`action` <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("`action` <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("`action` like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("`action` not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("`action` in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("`action` not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("`action` between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("`action` not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andSelectorIsNull() {
            addCriterion("selector is null");
            return (Criteria) this;
        }

        public Criteria andSelectorIsNotNull() {
            addCriterion("selector is not null");
            return (Criteria) this;
        }

        public Criteria andSelectorEqualTo(String value) {
            addCriterion("selector =", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorNotEqualTo(String value) {
            addCriterion("selector <>", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorGreaterThan(String value) {
            addCriterion("selector >", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorGreaterThanOrEqualTo(String value) {
            addCriterion("selector >=", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorLessThan(String value) {
            addCriterion("selector <", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorLessThanOrEqualTo(String value) {
            addCriterion("selector <=", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorLike(String value) {
            addCriterion("selector like", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorNotLike(String value) {
            addCriterion("selector not like", value, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorIn(List<String> values) {
            addCriterion("selector in", values, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorNotIn(List<String> values) {
            addCriterion("selector not in", values, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorBetween(String value1, String value2) {
            addCriterion("selector between", value1, value2, "selector");
            return (Criteria) this;
        }

        public Criteria andSelectorNotBetween(String value1, String value2) {
            addCriterion("selector not between", value1, value2, "selector");
            return (Criteria) this;
        }

        public Criteria andElementIsNull() {
            addCriterion("`element` is null");
            return (Criteria) this;
        }

        public Criteria andElementIsNotNull() {
            addCriterion("`element` is not null");
            return (Criteria) this;
        }

        public Criteria andElementEqualTo(String value) {
            addCriterion("`element` =", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotEqualTo(String value) {
            addCriterion("`element` <>", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThan(String value) {
            addCriterion("`element` >", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementGreaterThanOrEqualTo(String value) {
            addCriterion("`element` >=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThan(String value) {
            addCriterion("`element` <", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLessThanOrEqualTo(String value) {
            addCriterion("`element` <=", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementLike(String value) {
            addCriterion("`element` like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotLike(String value) {
            addCriterion("`element` not like", value, "element");
            return (Criteria) this;
        }

        public Criteria andElementIn(List<String> values) {
            addCriterion("`element` in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotIn(List<String> values) {
            addCriterion("`element` not in", values, "element");
            return (Criteria) this;
        }

        public Criteria andElementBetween(String value1, String value2) {
            addCriterion("`element` between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andElementNotBetween(String value1, String value2) {
            addCriterion("`element` not between", value1, value2, "element");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("`value` is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("`value` is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("`value` =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("`value` <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("`value` >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("`value` >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("`value` <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("`value` <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("`value` like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("`value` not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("`value` in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("`value` not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("`value` between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("`value` not between", value1, value2, "value");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TCaseStepExample example;

        protected Criteria(TCaseStepExample example) {
            super();
            this.example = example;
        }

        public TCaseStepExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.chancetop.qa.examples.TCaseStepExample example);
    }
}