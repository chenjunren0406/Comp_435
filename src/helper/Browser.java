package helper;

import java.awt.Component;
import java.util.Vector;

import org.cef.CefClient;
import org.cef.browser.CefBrowser;
import org.cef.callback.CefRunFileDialogCallback;
import org.cef.callback.CefStringVisitor;
import org.cef.handler.CefDialogHandler.FileDialogMode;
import org.cef.handler.CefRenderHandler;
import org.cef.network.CefRequest;

public class Browser implements CefBrowser {
	private CefBrowser orgin = null;
	public Browser(CefClient client,String URL,boolean os, boolean isTransparent){
		orgin = client.createBrowser("www.sina.com.cn", os, isTransparent);
	}
	@Override
	public boolean canGoBack() {
		return orgin.canGoBack();
	}
	@Override
	public boolean canGoForward() {
		return orgin.canGoForward();
	}
	@Override
	public void close() {
		orgin.close();
	}
	@Override
	public void executeJavaScript(String arg0, String arg1, int arg2) {
		orgin.executeJavaScript(arg0, arg1, arg2);
	}
	@Override
	public void find(int arg0, String arg1, boolean arg2, boolean arg3,
			boolean arg4) {
		orgin.find(arg0, arg1, arg2, arg3, arg4);
		
	}
	@Override
	public CefBrowser getDevTools() {
		return orgin.getDevTools();
	}
	@Override
	public int getIdentifier() {
		return orgin.getIdentifier();
	}
	@Override
	public CefRenderHandler getRenderHandler() {
		return orgin.getRenderHandler();
	}
	@Override
	public void getSource(CefStringVisitor arg0) {
		orgin.getSource(arg0);
	}
	@Override
	public void getText(CefStringVisitor arg0) {
		orgin.getText(arg0);
	}
	@Override
	public Component getUIComponent() {
		return orgin.getUIComponent();
	}
	@Override
	public String getURL() {
		
		return orgin.getURL();
	}
	@Override
	public double getZoomLevel() {
		return orgin.getZoomLevel();
	}
	@Override
	public void goBack() {
		orgin.goBack();
	}
	@Override
	public void goForward() {
		orgin.goForward();
	}
	@Override
	public boolean hasDocument() {
		
		return orgin.hasDocument();
	}
	@Override
	public boolean isLoading() {
		return orgin.isLoading();
	}
	@Override
	public boolean isPopup() {
		
		return orgin.isPopup();
	}
	@Override
	public void loadRequest(CefRequest arg0) {
		orgin.loadRequest(arg0);
	}
	@Override
	public void loadString(String arg0, String arg1) {
		orgin.loadString(arg0, arg1);
	}
	@Override
	public void loadURL(String arg0) {
		if(!arg0.startsWith("http") && !arg0.startsWith("www")){
			orgin.loadURL(arg0);
		}
		else{
			orgin.loadString("<html><body><head>" + "404" + "</head></body></html>", "www.baidu.com");
		}
		
	}
	@Override
	public void print() {
		orgin.print();
	}
	@Override
	public void reload() {
		orgin.reload();
	}
	@Override
	public void reloadIgnoreCache() {
		orgin.reloadIgnoreCache();
	}
	@Override
	public void runFileDialog(FileDialogMode arg0, String arg1, String arg2,
			Vector<String> arg3, CefRunFileDialogCallback arg4) {
		orgin.runFileDialog(arg0, arg1, arg2, arg3, arg4);
	}
	@Override
	public void setFocus(boolean arg0) {
		orgin.setFocus(arg0);
	}
	@Override
	public void setZoomLevel(double arg0) {
		orgin.setZoomLevel(arg0);
		
	}
	@Override
	public void startDownload(String arg0) {
		orgin.startDownload(arg0);
	}
	@Override
	public void stopFinding(boolean arg0) {
		orgin.stopFinding(arg0);
	}
	@Override
	public void stopLoad() {
		orgin.stopLoad();
	}
	@Override
	public void viewSource() {
		orgin.viewSource();
	}
}
