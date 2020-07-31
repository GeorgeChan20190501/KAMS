package com.kams.bean;

import java.util.ArrayList;
import java.util.List;

public class SmGonggaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmGonggaoExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDiscribIsNull() {
            addCriterion("discrib is null");
            return (Criteria) this;
        }

        public Criteria andDiscribIsNotNull() {
            addCriterion("discrib is not null");
            return (Criteria) this;
        }

        public Criteria andDiscribEqualTo(String value) {
            addCriterion("discrib =", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribNotEqualTo(String value) {
            addCriterion("discrib <>", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribGreaterThan(String value) {
            addCriterion("discrib >", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribGreaterThanOrEqualTo(String value) {
            addCriterion("discrib >=", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribLessThan(String value) {
            addCriterion("discrib <", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribLessThanOrEqualTo(String value) {
            addCriterion("discrib <=", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribLike(String value) {
            addCriterion("discrib like", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribNotLike(String value) {
            addCriterion("discrib not like", value, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribIn(List<String> values) {
            addCriterion("discrib in", values, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribNotIn(List<String> values) {
            addCriterion("discrib not in", values, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribBetween(String value1, String value2) {
            addCriterion("discrib between", value1, value2, "discrib");
            return (Criteria) this;
        }

        public Criteria andDiscribNotBetween(String value1, String value2) {
            addCriterion("discrib not between", value1, value2, "discrib");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(String value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(String value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(String value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(String value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(String value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(String value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLike(String value) {
            addCriterion("timestamp like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotLike(String value) {
            addCriterion("timestamp not like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<String> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<String> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(String value1, String value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(String value1, String value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNull() {
            addCriterion("contentType is null");
            return (Criteria) this;
        }

        public Criteria andContenttypeIsNotNull() {
            addCriterion("contentType is not null");
            return (Criteria) this;
        }

        public Criteria andContenttypeEqualTo(String value) {
            addCriterion("contentType =", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotEqualTo(String value) {
            addCriterion("contentType <>", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThan(String value) {
            addCriterion("contentType >", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("contentType >=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThan(String value) {
            addCriterion("contentType <", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLessThanOrEqualTo(String value) {
            addCriterion("contentType <=", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeLike(String value) {
            addCriterion("contentType like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotLike(String value) {
            addCriterion("contentType not like", value, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeIn(List<String> values) {
            addCriterion("contentType in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotIn(List<String> values) {
            addCriterion("contentType not in", values, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeBetween(String value1, String value2) {
            addCriterion("contentType between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andContenttypeNotBetween(String value1, String value2) {
            addCriterion("contentType not between", value1, value2, "contenttype");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
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

        public Criteria andFavoIsNull() {
            addCriterion("favo is null");
            return (Criteria) this;
        }

        public Criteria andFavoIsNotNull() {
            addCriterion("favo is not null");
            return (Criteria) this;
        }

        public Criteria andFavoEqualTo(String value) {
            addCriterion("favo =", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoNotEqualTo(String value) {
            addCriterion("favo <>", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoGreaterThan(String value) {
            addCriterion("favo >", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoGreaterThanOrEqualTo(String value) {
            addCriterion("favo >=", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoLessThan(String value) {
            addCriterion("favo <", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoLessThanOrEqualTo(String value) {
            addCriterion("favo <=", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoLike(String value) {
            addCriterion("favo like", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoNotLike(String value) {
            addCriterion("favo not like", value, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoIn(List<String> values) {
            addCriterion("favo in", values, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoNotIn(List<String> values) {
            addCriterion("favo not in", values, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoBetween(String value1, String value2) {
            addCriterion("favo between", value1, value2, "favo");
            return (Criteria) this;
        }

        public Criteria andFavoNotBetween(String value1, String value2) {
            addCriterion("favo not between", value1, value2, "favo");
            return (Criteria) this;
        }

        public Criteria andCommnumIsNull() {
            addCriterion("commNum is null");
            return (Criteria) this;
        }

        public Criteria andCommnumIsNotNull() {
            addCriterion("commNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommnumEqualTo(String value) {
            addCriterion("commNum =", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumNotEqualTo(String value) {
            addCriterion("commNum <>", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumGreaterThan(String value) {
            addCriterion("commNum >", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumGreaterThanOrEqualTo(String value) {
            addCriterion("commNum >=", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumLessThan(String value) {
            addCriterion("commNum <", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumLessThanOrEqualTo(String value) {
            addCriterion("commNum <=", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumLike(String value) {
            addCriterion("commNum like", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumNotLike(String value) {
            addCriterion("commNum not like", value, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumIn(List<String> values) {
            addCriterion("commNum in", values, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumNotIn(List<String> values) {
            addCriterion("commNum not in", values, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumBetween(String value1, String value2) {
            addCriterion("commNum between", value1, value2, "commnum");
            return (Criteria) this;
        }

        public Criteria andCommnumNotBetween(String value1, String value2) {
            addCriterion("commNum not between", value1, value2, "commnum");
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

        public Criteria andIsHotIsNull() {
            addCriterion("is_Hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_Hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("is_Hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("is_Hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("is_Hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("is_Hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("is_Hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("is_Hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("is_Hot like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("is_Hot not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("is_Hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("is_Hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("is_Hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("is_Hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andBgIsNull() {
            addCriterion("bg is null");
            return (Criteria) this;
        }

        public Criteria andBgIsNotNull() {
            addCriterion("bg is not null");
            return (Criteria) this;
        }

        public Criteria andBgEqualTo(String value) {
            addCriterion("bg =", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotEqualTo(String value) {
            addCriterion("bg <>", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThan(String value) {
            addCriterion("bg >", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgGreaterThanOrEqualTo(String value) {
            addCriterion("bg >=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThan(String value) {
            addCriterion("bg <", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLessThanOrEqualTo(String value) {
            addCriterion("bg <=", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgLike(String value) {
            addCriterion("bg like", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotLike(String value) {
            addCriterion("bg not like", value, "bg");
            return (Criteria) this;
        }

        public Criteria andBgIn(List<String> values) {
            addCriterion("bg in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotIn(List<String> values) {
            addCriterion("bg not in", values, "bg");
            return (Criteria) this;
        }

        public Criteria andBgBetween(String value1, String value2) {
            addCriterion("bg between", value1, value2, "bg");
            return (Criteria) this;
        }

        public Criteria andBgNotBetween(String value1, String value2) {
            addCriterion("bg not between", value1, value2, "bg");
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