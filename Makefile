run:
	docker-compose -f ./environments/dev/docker-compose-infra.yml -f ./environments/dev/docker-compose-app.yml up --build