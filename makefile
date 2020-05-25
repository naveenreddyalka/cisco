run:
	mkdir -p ~/tmp
	cd ~/tmp
	curl -O https://services.gradle.org/distributions/gradle-2.14.1-all.zip 
	unzip gradle-2.14.1-all.zip
	cd samples/native-binaries/

clean:
	 rm -f rf ~/tmp
