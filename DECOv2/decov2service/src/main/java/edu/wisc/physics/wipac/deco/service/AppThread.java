package edu.wisc.physics.wipac.deco.service;

/**
 * Created by andrewbiewer on 4/21/15.
 */
public class AppThread extends Thread
{
    private String TAG = "AppThread";

    public AppThread(Runnable runnable)
    {
        super(runnable);
        setUncaughtExceptionHandler(
            new UncaughtExceptionHandler()
            {
                @Override
                public void uncaughtException(Thread thread, Throwable e)
                {
                    Logger.e(TAG, "FATAL ERROR: Uncaught exception!", e);
                }
            }
        );
    }
}
