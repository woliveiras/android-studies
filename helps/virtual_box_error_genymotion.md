# How to fix Virtualbox error Kernel driver not installed

## Install dependêncies

```
sudo apt-get install build-essential module-assistant && sudo m-a prepare
```

## Recompile VBox Kernel

```
sudo /etc/init.d/vboxdrv setup
```

Wait...

Ok!

Run Genymotion.
