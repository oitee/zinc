--Follow these steps for manual setup:
--\c postgres;
--DROP DATABASE IF EXISTS zinc;
--CREATE DATABASE zinc;
--\connect zinc;
--DROP TABLE IF EXISTS note;

CREATE TABLE IF NOT EXISTS note (
id SERIAL PRIMARY KEY NOT NULL,
title TEXT,
body TEXT,
tags TEXT[],
updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW(),
created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW());

--SAMPLE INSERT QUERY:
--INSERT INTO note (id, title, body, tags) VALUES (1, 'Hey there', 'Today is ....', '{"note", "something"}');