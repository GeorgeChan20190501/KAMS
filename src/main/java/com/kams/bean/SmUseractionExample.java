package com.kams.bean;

import java.util.ArrayList;
import java.util.List;

public class SmUseractionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmUseractionExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReaderIsNull() {
            addCriterion("reader is null");
            return (Criteria) this;
        }

        public Criteria andReaderIsNotNull() {
            addCriterion("reader is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEqualTo(String value) {
            addCriterion("reader =", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotEqualTo(String value) {
            addCriterion("reader <>", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThan(String value) {
            addCriterion("reader >", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThanOrEqualTo(String value) {
            addCriterion("reader >=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThan(String value) {
            addCriterion("reader <", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThanOrEqualTo(String value) {
            addCriterion("reader <=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLike(String value) {
            addCriterion("reader like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotLike(String value) {
            addCriterion("reader not like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderIn(List<String> values) {
            addCriterion("reader in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotIn(List<String> values) {
            addCriterion("reader not in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderBetween(String value1, String value2) {
            addCriterion("reader between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotBetween(String value1, String value2) {
            addCriterion("reader not between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andArticalidIsNull() {
            addCriterion("articalId is null");
            return (Criteria) this;
        }

        public Criteria andArticalidIsNotNull() {
            addCriterion("articalId is not null");
            return (Criteria) this;
        }

        public Criteria andArticalidEqualTo(Integer value) {
            addCriterion("articalId =", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidNotEqualTo(Integer value) {
            addCriterion("articalId <>", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidGreaterThan(Integer value) {
            addCriterion("articalId >", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("articalId >=", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidLessThan(Integer value) {
            addCriterion("articalId <", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidLessThanOrEqualTo(Integer value) {
            addCriterion("articalId <=", value, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidIn(List<Integer> values) {
            addCriterion("articalId in", values, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidNotIn(List<Integer> values) {
            addCriterion("articalId not in", values, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidBetween(Integer value1, Integer value2) {
            addCriterion("articalId between", value1, value2, "articalid");
            return (Criteria) this;
        }

        public Criteria andArticalidNotBetween(Integer value1, Integer value2) {
            addCriterion("articalId not between", value1, value2, "articalid");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andDianzIsNull() {
            addCriterion("dianz is null");
            return (Criteria) this;
        }

        public Criteria andDianzIsNotNull() {
            addCriterion("dianz is not null");
            return (Criteria) this;
        }

        public Criteria andDianzEqualTo(String value) {
            addCriterion("dianz =", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzNotEqualTo(String value) {
            addCriterion("dianz <>", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzGreaterThan(String value) {
            addCriterion("dianz >", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzGreaterThanOrEqualTo(String value) {
            addCriterion("dianz >=", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzLessThan(String value) {
            addCriterion("dianz <", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzLessThanOrEqualTo(String value) {
            addCriterion("dianz <=", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzLike(String value) {
            addCriterion("dianz like", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzNotLike(String value) {
            addCriterion("dianz not like", value, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzIn(List<String> values) {
            addCriterion("dianz in", values, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzNotIn(List<String> values) {
            addCriterion("dianz not in", values, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzBetween(String value1, String value2) {
            addCriterion("dianz between", value1, value2, "dianz");
            return (Criteria) this;
        }

        public Criteria andDianzNotBetween(String value1, String value2) {
            addCriterion("dianz not between", value1, value2, "dianz");
            return (Criteria) this;
        }

        public Criteria andShoucIsNull() {
            addCriterion("shouc is null");
            return (Criteria) this;
        }

        public Criteria andShoucIsNotNull() {
            addCriterion("shouc is not null");
            return (Criteria) this;
        }

        public Criteria andShoucEqualTo(String value) {
            addCriterion("shouc =", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucNotEqualTo(String value) {
            addCriterion("shouc <>", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucGreaterThan(String value) {
            addCriterion("shouc >", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucGreaterThanOrEqualTo(String value) {
            addCriterion("shouc >=", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucLessThan(String value) {
            addCriterion("shouc <", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucLessThanOrEqualTo(String value) {
            addCriterion("shouc <=", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucLike(String value) {
            addCriterion("shouc like", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucNotLike(String value) {
            addCriterion("shouc not like", value, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucIn(List<String> values) {
            addCriterion("shouc in", values, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucNotIn(List<String> values) {
            addCriterion("shouc not in", values, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucBetween(String value1, String value2) {
            addCriterion("shouc between", value1, value2, "shouc");
            return (Criteria) this;
        }

        public Criteria andShoucNotBetween(String value1, String value2) {
            addCriterion("shouc not between", value1, value2, "shouc");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(String value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(String value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(String value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(String value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(String value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(String value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLike(String value) {
            addCriterion("views like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotLike(String value) {
            addCriterion("views not like", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<String> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<String> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(String value1, String value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(String value1, String value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andChkIsNull() {
            addCriterion("chk is null");
            return (Criteria) this;
        }

        public Criteria andChkIsNotNull() {
            addCriterion("chk is not null");
            return (Criteria) this;
        }

        public Criteria andChkEqualTo(String value) {
            addCriterion("chk =", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkNotEqualTo(String value) {
            addCriterion("chk <>", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkGreaterThan(String value) {
            addCriterion("chk >", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkGreaterThanOrEqualTo(String value) {
            addCriterion("chk >=", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkLessThan(String value) {
            addCriterion("chk <", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkLessThanOrEqualTo(String value) {
            addCriterion("chk <=", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkLike(String value) {
            addCriterion("chk like", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkNotLike(String value) {
            addCriterion("chk not like", value, "chk");
            return (Criteria) this;
        }

        public Criteria andChkIn(List<String> values) {
            addCriterion("chk in", values, "chk");
            return (Criteria) this;
        }

        public Criteria andChkNotIn(List<String> values) {
            addCriterion("chk not in", values, "chk");
            return (Criteria) this;
        }

        public Criteria andChkBetween(String value1, String value2) {
            addCriterion("chk between", value1, value2, "chk");
            return (Criteria) this;
        }

        public Criteria andChkNotBetween(String value1, String value2) {
            addCriterion("chk not between", value1, value2, "chk");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}