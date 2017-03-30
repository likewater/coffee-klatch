--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.2
-- Dumped by pg_dump version 9.6.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: regions; Type: TABLE; Schema: public; Owner: blakewomack
--

CREATE TABLE regions (
    id integer NOT NULL,
    region_name character varying
);


ALTER TABLE regions OWNER TO blakewomack;

--
-- Name: regions_id_seq; Type: SEQUENCE; Schema: public; Owner: blakewomack
--

CREATE SEQUENCE regions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE regions_id_seq OWNER TO blakewomack;

--
-- Name: regions_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: blakewomack
--

ALTER SEQUENCE regions_id_seq OWNED BY regions.id;


--
-- Name: reviews; Type: TABLE; Schema: public; Owner: blakewomack
--

CREATE TABLE reviews (
    id integer NOT NULL,
    review_grade character varying,
    review_review character varying,
    review_price character varying
);


ALTER TABLE reviews OWNER TO blakewomack;

--
-- Name: reviews_id_seq; Type: SEQUENCE; Schema: public; Owner: blakewomack
--

CREATE SEQUENCE reviews_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE reviews_id_seq OWNER TO blakewomack;

--
-- Name: reviews_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: blakewomack
--

ALTER SEQUENCE reviews_id_seq OWNED BY reviews.id;


--
-- Name: varietals; Type: TABLE; Schema: public; Owner: blakewomack
--

CREATE TABLE varietals (
    id integer NOT NULL,
    varietal_name character varying
);


ALTER TABLE varietals OWNER TO blakewomack;

--
-- Name: varietals_id_seq; Type: SEQUENCE; Schema: public; Owner: blakewomack
--

CREATE SEQUENCE varietals_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE varietals_id_seq OWNER TO blakewomack;

--
-- Name: varietals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: blakewomack
--

ALTER SEQUENCE varietals_id_seq OWNED BY varietals.id;


--
-- Name: regions id; Type: DEFAULT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY regions ALTER COLUMN id SET DEFAULT nextval('regions_id_seq'::regclass);


--
-- Name: reviews id; Type: DEFAULT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY reviews ALTER COLUMN id SET DEFAULT nextval('reviews_id_seq'::regclass);


--
-- Name: varietals id; Type: DEFAULT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY varietals ALTER COLUMN id SET DEFAULT nextval('varietals_id_seq'::regclass);


--
-- Data for Name: regions; Type: TABLE DATA; Schema: public; Owner: blakewomack
--

COPY regions (id, region_name) FROM stdin;
\.


--
-- Name: regions_id_seq; Type: SEQUENCE SET; Schema: public; Owner: blakewomack
--

SELECT pg_catalog.setval('regions_id_seq', 1, false);


--
-- Data for Name: reviews; Type: TABLE DATA; Schema: public; Owner: blakewomack
--

COPY reviews (id, review_grade, review_review, review_price) FROM stdin;
\.


--
-- Name: reviews_id_seq; Type: SEQUENCE SET; Schema: public; Owner: blakewomack
--

SELECT pg_catalog.setval('reviews_id_seq', 1, false);


--
-- Data for Name: varietals; Type: TABLE DATA; Schema: public; Owner: blakewomack
--

COPY varietals (id, varietal_name) FROM stdin;
\.


--
-- Name: varietals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: blakewomack
--

SELECT pg_catalog.setval('varietals_id_seq', 1, false);


--
-- Name: regions regions_pkey; Type: CONSTRAINT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY regions
    ADD CONSTRAINT regions_pkey PRIMARY KEY (id);


--
-- Name: reviews reviews_pkey; Type: CONSTRAINT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY reviews
    ADD CONSTRAINT reviews_pkey PRIMARY KEY (id);


--
-- Name: varietals varietals_pkey; Type: CONSTRAINT; Schema: public; Owner: blakewomack
--

ALTER TABLE ONLY varietals
    ADD CONSTRAINT varietals_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

