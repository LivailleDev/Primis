import { clsx } from 'clsx';
import { HTMLAttributes, ReactNode } from 'react';

export interface TextInputProps extends HTMLAttributes<HTMLInputElement> {}

interface TextInputRootProps {
    children: ReactNode;
}

function TextInputRoot(props: TextInputRootProps){
    return (
        <div className="py-4, px-3 bg-brown-600 text-gray-400  ring-1 ring-brown-200 outline-none">
            </div>
    )
} 

function TextInputIcon (){}

function TextInputInput(props: TextInputProps) {
    return (
      


        <input
            className={clsx(
                '',
            )}
            {...props}
        />

    )
}



