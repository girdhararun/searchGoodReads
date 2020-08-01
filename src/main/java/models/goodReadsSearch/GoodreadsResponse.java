package models.goodReadsSearch;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "request",
        "search"
})
@XmlRootElement(name = "GoodreadsResponse")
public class GoodreadsResponse {

    @XmlElement(name = "Request", required = true)
    protected GoodreadsResponse.Request request;
    @XmlElement(required = true)
    protected GoodreadsResponse.Search search;

    public GoodreadsResponse.Request getRequest() {
        return request;
    }

    public void setRequest(GoodreadsResponse.Request value) {
        this.request = value;
    }

    public GoodreadsResponse.Search getSearch() {
        return search;
    }

    public void setSearch(GoodreadsResponse.Search value) {
        this.search = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "authentication",
            "key",
            "method"
    })
    public static class Request {

        @XmlElement(required = true)
        protected String authentication;
        @XmlElement(required = true)
        protected String key;
        @XmlElement(required = true)
        protected String method;

        public String getAuthentication() {
            return authentication;
        }


        public void setAuthentication(String value) {
            this.authentication = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String value) {
            this.key = value;
        }


        public String getMethod() {
            return method;
        }


        public void setMethod(String value) {
            this.method = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "query",
            "resultsStart",
            "resultsEnd",
            "totalResults",
            "source",
            "queryTimeSeconds",
            "results"
    })
    public static class Search {

        @XmlElement(required = true)
        protected String query;
        @XmlElement(name = "results-start")
        protected byte resultsStart;
        @XmlElement(name = "results-end")
        protected byte resultsEnd;
        @XmlElement(name = "total-results")
        protected short totalResults;
        @XmlElement(required = true)
        protected String source;
        @XmlElement(name = "query-time-seconds")
        protected float queryTimeSeconds;
        @XmlElement(required = true)
        protected GoodreadsResponse.Search.Results results;

        public String getQuery() {
            return query;
        }


        public void setQuery(String value) {
            this.query = value;
        }


        public byte getResultsStart() {
            return resultsStart;
        }


        public void setResultsStart(byte value) {
            this.resultsStart = value;
        }


        public byte getResultsEnd() {
            return resultsEnd;
        }

        public void setResultsEnd(byte value) {
            this.resultsEnd = value;
        }

        public short getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(short value) {
            this.totalResults = value;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String value) {
            this.source = value;
        }

        public float getQueryTimeSeconds() {
            return queryTimeSeconds;
        }

        public void setQueryTimeSeconds(float value) {
            this.queryTimeSeconds = value;
        }


        public GoodreadsResponse.Search.Results getResults() {
            return results;
        }


        public void setResults(GoodreadsResponse.Search.Results value) {
            this.results = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "work"
        })
        public static class Results {

            protected List<Work> work;


            public List<Work> getWork() {
                if (work == null) {
                    work = new ArrayList<Work>();
                }
                return this.work;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "id",
                    "booksCount",
                    "ratingsCount",
                    "textReviewsCount",
                    "originalPublicationYear",
                    "originalPublicationMonth",
                    "originalPublicationDay",
                    "averageRating",
                    "bestBook"
            })
            public static class Work {

                @XmlElement(required = true)
                protected GoodreadsResponse.Search.Results.Work.Id id;
                @XmlElement(name = "books_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.BooksCount booksCount;
                @XmlElement(name = "ratings_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.RatingsCount ratingsCount;
                @XmlElement(name = "text_reviews_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.TextReviewsCount textReviewsCount;
                @XmlElement(name = "original_publication_year", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationYear originalPublicationYear;
                @XmlElement(name = "original_publication_month", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth originalPublicationMonth;
                @XmlElement(name = "original_publication_day", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationDay originalPublicationDay;
                @XmlElement(name = "average_rating")
                protected float averageRating;
                @XmlElement(name = "best_book", required = true)
                protected GoodreadsResponse.Search.Results.Work.BestBook bestBook;


                public GoodreadsResponse.Search.Results.Work.Id getId() {
                    return id;
                }

                public void setId(GoodreadsResponse.Search.Results.Work.Id value) {
                    this.id = value;
                }


                public GoodreadsResponse.Search.Results.Work.BooksCount getBooksCount() {
                    return booksCount;
                }

                public void setBooksCount(GoodreadsResponse.Search.Results.Work.BooksCount value) {
                    this.booksCount = value;
                }

                public GoodreadsResponse.Search.Results.Work.RatingsCount getRatingsCount() {
                    return ratingsCount;
                }

                public void setRatingsCount(GoodreadsResponse.Search.Results.Work.RatingsCount value) {
                    this.ratingsCount = value;
                }

                public GoodreadsResponse.Search.Results.Work.TextReviewsCount getTextReviewsCount() {
                    return textReviewsCount;
                }

                public void setTextReviewsCount(GoodreadsResponse.Search.Results.Work.TextReviewsCount value) {
                    this.textReviewsCount = value;
                }

                public GoodreadsResponse.Search.Results.Work.OriginalPublicationYear getOriginalPublicationYear() {
                    return originalPublicationYear;
                }

                public void setOriginalPublicationYear(GoodreadsResponse.Search.Results.Work.OriginalPublicationYear value) {
                    this.originalPublicationYear = value;
                }

                public GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth getOriginalPublicationMonth() {
                    return originalPublicationMonth;
                }

                public void setOriginalPublicationMonth(GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth value) {
                    this.originalPublicationMonth = value;
                }

                public GoodreadsResponse.Search.Results.Work.OriginalPublicationDay getOriginalPublicationDay() {
                    return originalPublicationDay;
                }

                public void setOriginalPublicationDay(GoodreadsResponse.Search.Results.Work.OriginalPublicationDay value) {
                    this.originalPublicationDay = value;
                }


                public float getAverageRating() {
                    return averageRating;
                }

                public void setAverageRating(float value) {
                    this.averageRating = value;
                }

                public GoodreadsResponse.Search.Results.Work.BestBook getBestBook() {
                    return bestBook;
                }

                public void setBestBook(GoodreadsResponse.Search.Results.Work.BestBook value) {
                    this.bestBook = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "id",
                        "title",
                        "author",
                        "imageUrl",
                        "smallImageUrl"
                })
                public static class BestBook {

                    @XmlElement(required = true)
                    protected GoodreadsResponse.Search.Results.Work.BestBook.Id id;
                    @XmlElement(required = true)
                    protected String title;
                    @XmlElement(required = true)
                    protected GoodreadsResponse.Search.Results.Work.BestBook.Author author;
                    @XmlElement(name = "image_url", required = true)
                    protected String imageUrl;
                    @XmlElement(name = "small_image_url", required = true)
                    protected String smallImageUrl;

                    public void setId(GoodreadsResponse.Search.Results.Work.BestBook.Id value) {
                        this.id = value;
                    }

                    @XmlAttribute(name = "type")
                    protected String type;


                    public GoodreadsResponse.Search.Results.Work.BestBook.Id getId() {
                        return id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String value) {
                        this.title = value;
                    }

                    public GoodreadsResponse.Search.Results.Work.BestBook.Author getAuthor() {
                        return author;
                    }

                    public void setAuthor(GoodreadsResponse.Search.Results.Work.BestBook.Author value) {
                        this.author = value;
                    }

                    public String getImageUrl() {
                        return imageUrl;
                    }

                    public void setImageUrl(String value) {
                        this.imageUrl = value;
                    }

                    public String getSmallImageUrl() {
                        return smallImageUrl;
                    }

                    public void setSmallImageUrl(String value) {
                        this.smallImageUrl = value;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "id",
                            "name"
                    })
                    public static class Author {

                        @XmlElement(required = true)
                        protected GoodreadsResponse.Search.Results.Work.BestBook.Author.Id id;
                        @XmlElement(required = true)
                        protected String name;

                        public GoodreadsResponse.Search.Results.Work.BestBook.Author.Id getId() {
                            return id;
                        }

                        public void setId(GoodreadsResponse.Search.Results.Work.BestBook.Author.Id value) {
                            this.id = value;
                        }


                        public String getName() {
                            return name;
                        }

                        public void setName(String value) {
                            this.name = value;
                        }


                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                                "value"
                        })
                        public static class Id {

                            @XmlValue
                            protected int value;
                            @XmlAttribute(name = "type")
                            protected String type;


                            public int getValue() {
                                return value;
                            }


                            public void setValue(int value) {
                                this.value = value;
                            }


                            public String getType() {
                                return type;
                            }

                            public void setType(String value) {
                                this.type = value;
                            }

                        }

                    }


                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "value"
                    })
                    public static class Id {

                        @XmlValue
                        protected int value;
                        @XmlAttribute(name = "type")
                        protected String type;


                        public int getValue() {
                            return value;
                        }


                        public void setValue(int value) {
                            this.value = value;
                        }


                        public String getType() {
                            return type;
                        }

                        public void setType(String value) {
                            this.type = value;
                        }

                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class BooksCount {

                    @XmlValue
                    protected short value;
                    @XmlAttribute(name = "type")
                    protected String type;


                    public short getValue() {
                        return value;
                    }


                    public void setValue(short value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class Id {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;


                    public int getValue() {
                        return value;
                    }


                    public void setValue(int value) {
                        this.value = value;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class OriginalPublicationDay {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "nil")
                    protected String nil;

                    public String getValue() {
                        return value;
                    }


                    public void setValue(String value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                    public String getNil() {
                        return nil;
                    }


                    public void setNil(String value) {
                        this.nil = value;
                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class OriginalPublicationMonth {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "nil")
                    protected String nil;

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }


                    public String getNil() {
                        return nil;
                    }


                    public void setNil(String value) {
                        this.nil = value;
                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class OriginalPublicationYear {

                    @XmlValue
                    protected short value;
                    @XmlAttribute(name = "type")
                    protected String type;


                    public short getValue() {
                        return value;
                    }


                    public void setValue(short value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }


                    public void setType(String value) {
                        this.type = value;
                    }

                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class RatingsCount {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;


                    public int getValue() {
                        return value;
                    }


                    public void setValue(int value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "value"
                })
                public static class TextReviewsCount {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;


                    public int getValue() {
                        return value;
                    }


                    public void setValue(int value) {
                        this.value = value;
                    }


                    public String getType() {
                        return type;
                    }

                    public void setType(String value) {
                        this.type = value;
                    }

                }

            }

        }

    }

}
