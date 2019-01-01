insert into test.user ( user_name) VALUES ('nom C')

DELETE FROM test.user WHERE user_name like '%Admin%'

CREATE SEQUENCE test.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE test.user ALTER COLUMN user_id SET DEFAULT nextval('test.user_id_seq'::regclass) ;