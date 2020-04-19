
sudo apt update
sudo add-apt-repository ppa:linuxuprising/java

sudo apt install oracle-java14-installer
sudo apt install oracle-java14-set-default

sudo apt update
sudo apt autoremove

java --version


sudo apt remove oracle-java14-installer


# https://www.eclipse.org/downloads/


cd /opt

sudo tar -xvzf ~/Downloads/<filename-you-just-downloaded>

sudo gedit eclipse.desktop

[Desktop Entry]
Name=Eclipse
Type=Application
Exec=/opt/eclipse/eclipse
Terminal=false
Icon=/opt/eclipse/icon.xpm
Comment=Integrated Development Environment
NoDisplay=false
Categories=Development;IDE;
Name[en]=Eclipse
Name[en_US]=Eclipse

sudo desktop-file-install eclipse.desktop
