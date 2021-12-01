package com.chancetop.qa.examples;

import com.chancetop.qa.model.TBrowser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBrowserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBrowserExample() {
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

    public TBrowserExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TBrowserExample orderBy(String ... orderByClauses) {
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
        TBrowserExample example = new TBrowserExample();
        return example.createCriteria();
    }

    public TBrowserExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TBrowserExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andTProjectIdEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTProjectIdNotEqualTo(Long value) {
            addCriterion("t_project_id <>", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThan(Long value) {
            addCriterion("t_project_id >", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t_project_id >=", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThan(Long value) {
            addCriterion("t_project_id <", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("t_project_id <=", value, "tProjectId");
            return (Criteria) this;
        }

        public Criteria andTProjectIdLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("t_project_id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andRemoteUrlIsNull() {
            addCriterion("remote_url is null");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlIsNotNull() {
            addCriterion("remote_url is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlEqualTo(String value) {
            addCriterion("remote_url =", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlNotEqualTo(String value) {
            addCriterion("remote_url <>", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlGreaterThan(String value) {
            addCriterion("remote_url >", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("remote_url >=", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlLessThan(String value) {
            addCriterion("remote_url <", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlLessThanOrEqualTo(String value) {
            addCriterion("remote_url <=", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("remote_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemoteUrlLike(String value) {
            addCriterion("remote_url like", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlNotLike(String value) {
            addCriterion("remote_url not like", value, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlIn(List<String> values) {
            addCriterion("remote_url in", values, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlNotIn(List<String> values) {
            addCriterion("remote_url not in", values, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlBetween(String value1, String value2) {
            addCriterion("remote_url between", value1, value2, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andRemoteUrlNotBetween(String value1, String value2) {
            addCriterion("remote_url not between", value1, value2, "remoteUrl");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIsNull() {
            addCriterion("browser_name is null");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIsNotNull() {
            addCriterion("browser_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserNameEqualTo(String value) {
            addCriterion("browser_name =", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotEqualTo(String value) {
            addCriterion("browser_name <>", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThan(String value) {
            addCriterion("browser_name >", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThanOrEqualTo(String value) {
            addCriterion("browser_name >=", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThan(String value) {
            addCriterion("browser_name <", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThanOrEqualTo(String value) {
            addCriterion("browser_name <=", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserNameLike(String value) {
            addCriterion("browser_name like", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotLike(String value) {
            addCriterion("browser_name not like", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIn(List<String> values) {
            addCriterion("browser_name in", values, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotIn(List<String> values) {
            addCriterion("browser_name not in", values, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameBetween(String value1, String value2) {
            addCriterion("browser_name between", value1, value2, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotBetween(String value1, String value2) {
            addCriterion("browser_name not between", value1, value2, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIsNull() {
            addCriterion("browser_version is null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIsNotNull() {
            addCriterion("browser_version is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionEqualTo(String value) {
            addCriterion("browser_version =", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotEqualTo(String value) {
            addCriterion("browser_version <>", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThan(String value) {
            addCriterion("browser_version >", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThanOrEqualTo(String value) {
            addCriterion("browser_version >=", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThan(String value) {
            addCriterion("browser_version <", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThanOrEqualTo(String value) {
            addCriterion("browser_version <=", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("browser_version <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrowserVersionLike(String value) {
            addCriterion("browser_version like", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotLike(String value) {
            addCriterion("browser_version not like", value, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionIn(List<String> values) {
            addCriterion("browser_version in", values, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotIn(List<String> values) {
            addCriterion("browser_version not in", values, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionBetween(String value1, String value2) {
            addCriterion("browser_version between", value1, value2, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andBrowserVersionNotBetween(String value1, String value2) {
            addCriterion("browser_version not between", value1, value2, "browserVersion");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("platform <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("create_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualToColumn(TBrowser.Column column) {
            addCriterion(new StringBuilder("update_date <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TBrowserExample example;

        protected Criteria(TBrowserExample example) {
            super();
            this.example = example;
        }

        public TBrowserExample example() {
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
        void example(com.chancetop.qa.examples.TBrowserExample example);
    }
}