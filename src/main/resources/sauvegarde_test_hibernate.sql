--
-- PostgreSQL database dump
--

-- Dumped from database version 11.1
-- Dumped by pg_dump version 11.1

-- Started on 2019-01-01 16:13:33

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 8 (class 2615 OID 25013)
-- Name: test; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA test;


ALTER SCHEMA test OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 199 (class 1259 OID 30863)
-- Name: employee; Type: TABLE; Schema: test; Owner: postgres
--

CREATE TABLE test.employee (
    user_id bigint,
    employee_title character varying
);


ALTER TABLE test.employee OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 25020)
-- Name: mere_id_seq; Type: SEQUENCE; Schema: test; Owner: postgres
--

CREATE SEQUENCE test.mere_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE test.mere_id_seq OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 30857)
-- Name: user; Type: TABLE; Schema: test; Owner: postgres
--

CREATE TABLE test."user" (
    user_id bigint,
    user_name character varying
);


ALTER TABLE test."user" OWNER TO postgres;

--
-- TOC entry 2815 (class 0 OID 30863)
-- Dependencies: 199
-- Data for Name: employee; Type: TABLE DATA; Schema: test; Owner: postgres
--

COPY test.employee (user_id, employee_title) FROM stdin;
\.


--
-- TOC entry 2814 (class 0 OID 30857)
-- Dependencies: 198
-- Data for Name: user; Type: TABLE DATA; Schema: test; Owner: postgres
--

COPY test."user" (user_id, user_name) FROM stdin;
\.


--
-- TOC entry 2821 (class 0 OID 0)
-- Dependencies: 197
-- Name: mere_id_seq; Type: SEQUENCE SET; Schema: test; Owner: postgres
--

SELECT pg_catalog.setval('test.mere_id_seq', 1, false);


-- Completed on 2019-01-01 16:13:35

--
-- PostgreSQL database dump complete
--

