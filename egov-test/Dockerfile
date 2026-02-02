# eGovFrame 애플리케이션 Dockerfile
FROM tomcat:10-jdk17-temurin-jammy

# 작성자 정보
LABEL maintainer="egov-lawmatcher"
LABEL description="eGovFrame Law Matcher Application"

# Tomcat 설정
RUN rm -rf /usr/local/tomcat/webapps/*

# WAR 파일 복사
COPY target/egov-test-1.0.0.war /usr/local/tomcat/webapps/ROOT.war

# 포트 노출
EXPOSE 8080

# Tomcat 실행
CMD ["catalina.sh", "run"]
