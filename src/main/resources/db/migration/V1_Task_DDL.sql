CREATE TABLE test.tasks (
	taskid varchar NOT NULL,
	projectid varchar NOT NULL,
	testid varchar NOT NULL,
	status varchar NOT NULL,
	start_time varchar NULL,
	next_poll_time varchar NULL,
	end_time varchar NULL,
	CONSTRAINT tasks_pk PRIMARY KEY (taskid),
	CONSTRAINT tasks_un UNIQUE (testid)
);